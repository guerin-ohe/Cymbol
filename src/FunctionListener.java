/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author GUERINOI
 */
public class FunctionListener extends CymbolBaseListener {

    Graph graph = new Graph();
    String currentFunctionName = null;

    public void enterFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
        currentFunctionName = ctx.ID().getText();
        graph.nodes.add(currentFunctionName);
    }

    public void exitCall(CymbolParser.CallContext ctx) {
        String funcName = ctx.ID().getText();
        // map current function to the callee
        graph.edge(currentFunctionName, funcName);
    }

}
