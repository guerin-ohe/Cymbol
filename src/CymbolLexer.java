// Generated from Cymbol.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CymbolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, DIGIT=22, ID=23, INT=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "DIGIT", "ID", "LETTER", "INT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "';'", "'float'", "'int'", "'void'", "'('", "')'", "','", 
		"'{'", "'}'", "'if'", "'then'", "'else'", "'return'", "'['", "']'", "'-'", 
		"'!'", "'*'", "'+'", "'=='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "DIGIT", "ID", 
		"INT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public CymbolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cymbol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u0089\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\7\30{\n\30\f\30\16\30~\13"+
		"\30\3\31\3\31\3\32\5\32\u0083\n\32\3\32\6\32\u0086\n\32\r\32\16\32\u0087"+
		"\2\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\2\63\32\3\2\4\3\2\62"+
		";\6\2C\\aac|\u0082\u0101\u008b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5\67\3\2\2\2"+
		"\79\3\2\2\2\t?\3\2\2\2\13C\3\2\2\2\rH\3\2\2\2\17J\3\2\2\2\21L\3\2\2\2"+
		"\23N\3\2\2\2\25P\3\2\2\2\27R\3\2\2\2\31U\3\2\2\2\33Z\3\2\2\2\35_\3\2\2"+
		"\2\37f\3\2\2\2!h\3\2\2\2#j\3\2\2\2%l\3\2\2\2\'n\3\2\2\2)p\3\2\2\2+r\3"+
		"\2\2\2-u\3\2\2\2/w\3\2\2\2\61\177\3\2\2\2\63\u0082\3\2\2\2\65\66\7?\2"+
		"\2\66\4\3\2\2\2\678\7=\2\28\6\3\2\2\29:\7h\2\2:;\7n\2\2;<\7q\2\2<=\7c"+
		"\2\2=>\7v\2\2>\b\3\2\2\2?@\7k\2\2@A\7p\2\2AB\7v\2\2B\n\3\2\2\2CD\7x\2"+
		"\2DE\7q\2\2EF\7k\2\2FG\7f\2\2G\f\3\2\2\2HI\7*\2\2I\16\3\2\2\2JK\7+\2\2"+
		"K\20\3\2\2\2LM\7.\2\2M\22\3\2\2\2NO\7}\2\2O\24\3\2\2\2PQ\7\177\2\2Q\26"+
		"\3\2\2\2RS\7k\2\2ST\7h\2\2T\30\3\2\2\2UV\7v\2\2VW\7j\2\2WX\7g\2\2XY\7"+
		"p\2\2Y\32\3\2\2\2Z[\7g\2\2[\\\7n\2\2\\]\7u\2\2]^\7g\2\2^\34\3\2\2\2_`"+
		"\7t\2\2`a\7g\2\2ab\7v\2\2bc\7w\2\2cd\7t\2\2de\7p\2\2e\36\3\2\2\2fg\7]"+
		"\2\2g \3\2\2\2hi\7_\2\2i\"\3\2\2\2jk\7/\2\2k$\3\2\2\2lm\7#\2\2m&\3\2\2"+
		"\2no\7,\2\2o(\3\2\2\2pq\7-\2\2q*\3\2\2\2rs\7?\2\2st\7?\2\2t,\3\2\2\2u"+
		"v\t\2\2\2v.\3\2\2\2w|\5\61\31\2x{\5\61\31\2y{\5-\27\2zx\3\2\2\2zy\3\2"+
		"\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\60\3\2\2\2~|\3\2\2\2\177\u0080\t\3"+
		"\2\2\u0080\62\3\2\2\2\u0081\u0083\7/\2\2\u0082\u0081\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0086\5-\27\2\u0085\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\64\3\2\2"+
		"\2\7\2z|\u0082\u0087\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}