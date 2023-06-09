// Generated from gramatica.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DjangoModelLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, NUM=11, STR=12, EXC=13, LPAR=14, RPAR=15, PONT=16, PONTVIRG=17, 
		VIRG=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "NUM", "STR", "EXC", "LPAR", "RPAR", "PONT", "PONTVIRG", "VIRG"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'models.Model'", "'{'", "'}'", "'models.CharField'", 
			"'models.BooleanField'", "'models.IntegerField'", "'models.ForeignKey'", 
			"'max_length='", "'verbose_name='", null, null, null, "'('", "')'", "':'", 
			"';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "NUM", 
			"STR", "EXC", "LPAR", "RPAR", "PONT", "PONTVIRG", "VIRG"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public DjangoModelLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u00c0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\6\f\u00a5\n\f\r\f\16\f\u00a6\3"+
		"\r\3\r\7\r\u00ab\n\r\f\r\16\r\u00ae\13\r\3\16\6\16\u00b1\n\16\r\16\16"+
		"\16\u00b2\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\3\2\6\3\2\62;\4\2C\\c|\6\2\62;C\\aac|\5\2\13"+
		"\f\17\17\"\"\2\u00c2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5-\3\2\2\2\7:\3\2\2\2"+
		"\t<\3\2\2\2\13>\3\2\2\2\rO\3\2\2\2\17c\3\2\2\2\21w\3\2\2\2\23\u0089\3"+
		"\2\2\2\25\u0095\3\2\2\2\27\u00a4\3\2\2\2\31\u00a8\3\2\2\2\33\u00b0\3\2"+
		"\2\2\35\u00b6\3\2\2\2\37\u00b8\3\2\2\2!\u00ba\3\2\2\2#\u00bc\3\2\2\2%"+
		"\u00be\3\2\2\2\'(\7e\2\2()\7n\2\2)*\7c\2\2*+\7u\2\2+,\7u\2\2,\4\3\2\2"+
		"\2-.\7o\2\2./\7q\2\2/\60\7f\2\2\60\61\7g\2\2\61\62\7n\2\2\62\63\7u\2\2"+
		"\63\64\7\60\2\2\64\65\7O\2\2\65\66\7q\2\2\66\67\7f\2\2\678\7g\2\289\7"+
		"n\2\29\6\3\2\2\2:;\7}\2\2;\b\3\2\2\2<=\7\177\2\2=\n\3\2\2\2>?\7o\2\2?"+
		"@\7q\2\2@A\7f\2\2AB\7g\2\2BC\7n\2\2CD\7u\2\2DE\7\60\2\2EF\7E\2\2FG\7j"+
		"\2\2GH\7c\2\2HI\7t\2\2IJ\7H\2\2JK\7k\2\2KL\7g\2\2LM\7n\2\2MN\7f\2\2N\f"+
		"\3\2\2\2OP\7o\2\2PQ\7q\2\2QR\7f\2\2RS\7g\2\2ST\7n\2\2TU\7u\2\2UV\7\60"+
		"\2\2VW\7D\2\2WX\7q\2\2XY\7q\2\2YZ\7n\2\2Z[\7g\2\2[\\\7c\2\2\\]\7p\2\2"+
		"]^\7H\2\2^_\7k\2\2_`\7g\2\2`a\7n\2\2ab\7f\2\2b\16\3\2\2\2cd\7o\2\2de\7"+
		"q\2\2ef\7f\2\2fg\7g\2\2gh\7n\2\2hi\7u\2\2ij\7\60\2\2jk\7K\2\2kl\7p\2\2"+
		"lm\7v\2\2mn\7g\2\2no\7i\2\2op\7g\2\2pq\7t\2\2qr\7H\2\2rs\7k\2\2st\7g\2"+
		"\2tu\7n\2\2uv\7f\2\2v\20\3\2\2\2wx\7o\2\2xy\7q\2\2yz\7f\2\2z{\7g\2\2{"+
		"|\7n\2\2|}\7u\2\2}~\7\60\2\2~\177\7H\2\2\177\u0080\7q\2\2\u0080\u0081"+
		"\7t\2\2\u0081\u0082\7g\2\2\u0082\u0083\7k\2\2\u0083\u0084\7i\2\2\u0084"+
		"\u0085\7p\2\2\u0085\u0086\7M\2\2\u0086\u0087\7g\2\2\u0087\u0088\7{\2\2"+
		"\u0088\22\3\2\2\2\u0089\u008a\7o\2\2\u008a\u008b\7c\2\2\u008b\u008c\7"+
		"z\2\2\u008c\u008d\7a\2\2\u008d\u008e\7n\2\2\u008e\u008f\7g\2\2\u008f\u0090"+
		"\7p\2\2\u0090\u0091\7i\2\2\u0091\u0092\7v\2\2\u0092\u0093\7j\2\2\u0093"+
		"\u0094\7?\2\2\u0094\24\3\2\2\2\u0095\u0096\7x\2\2\u0096\u0097\7g\2\2\u0097"+
		"\u0098\7t\2\2\u0098\u0099\7d\2\2\u0099\u009a\7q\2\2\u009a\u009b\7u\2\2"+
		"\u009b\u009c\7g\2\2\u009c\u009d\7a\2\2\u009d\u009e\7p\2\2\u009e\u009f"+
		"\7c\2\2\u009f\u00a0\7o\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7?\2\2\u00a2"+
		"\26\3\2\2\2\u00a3\u00a5\t\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2"+
		"\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\30\3\2\2\2\u00a8\u00ac"+
		"\t\3\2\2\u00a9\u00ab\t\4\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\32\3\2\2\2\u00ae\u00ac\3\2\2"+
		"\2\u00af\u00b1\t\5\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0"+
		"\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\b\16\2\2"+
		"\u00b5\34\3\2\2\2\u00b6\u00b7\7*\2\2\u00b7\36\3\2\2\2\u00b8\u00b9\7+\2"+
		"\2\u00b9 \3\2\2\2\u00ba\u00bb\7<\2\2\u00bb\"\3\2\2\2\u00bc\u00bd\7=\2"+
		"\2\u00bd$\3\2\2\2\u00be\u00bf\7.\2\2\u00bf&\3\2\2\2\6\2\u00a6\u00ac\u00b2"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}