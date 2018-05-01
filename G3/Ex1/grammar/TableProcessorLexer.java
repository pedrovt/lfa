// Generated from TableProcessorLexer.g4 by ANTLR 4.7.1

// --------------------------------
// Bloco 3, Ex. 1
// TableProcessorLexer
// Formal and Automated Languages
// Pedro Teixeira, 84715, MIECT
// --------------------------------

package grammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TableProcessorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		READ=1, PRINT=2, WRITE=3, JOIN=4, SELECT=5, FROM=6, ADD=7, SUBTRACT=8, 
		MULTIPLY=9, DIVIDE=10, SAVEALL=11, ARROW=12, INT=13, C_FILE_NAME=14, ID=15, 
		FILE_NAME=16, LINE_COMMENT=17, COMMENT=18, WS=19, ERROR=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"READ", "PRINT", "WRITE", "JOIN", "SELECT", "FROM", "ADD", "SUBTRACT", 
		"MULTIPLY", "DIVIDE", "SAVEALL", "ARROW", "INT", "C_FILE_NAME", "ID", 
		"FILE_NAME", "LINE_COMMENT", "COMMENT", "WS", "ERROR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'READ'", "'PRINT'", "'WRITE'", "'JOIN'", "'SELECT'", "'FROM'", 
		"'ADD'", "'SUBTRACT'", "'MULTIPLY'", "'DIVIDE'", "'SAVE ALL'", "'->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "READ", "PRINT", "WRITE", "JOIN", "SELECT", "FROM", "ADD", "SUBTRACT", 
		"MULTIPLY", "DIVIDE", "SAVEALL", "ARROW", "INT", "C_FILE_NAME", "ID", 
		"FILE_NAME", "LINE_COMMENT", "COMMENT", "WS", "ERROR"
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


	public TableProcessorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TableProcessorLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u00b5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\6"+
		"\16x\n\16\r\16\16\16y\3\17\6\17}\n\17\r\17\16\17~\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\7\20\u0088\n\20\f\20\16\20\u008b\13\20\3\21\6\21\u008e"+
		"\n\21\r\21\16\21\u008f\3\22\3\22\3\22\3\22\7\22\u0096\n\22\f\22\16\22"+
		"\u0099\13\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u00a3\n\23\f"+
		"\23\16\23\u00a6\13\23\3\23\3\23\3\23\3\23\3\23\3\24\6\24\u00ae\n\24\r"+
		"\24\16\24\u00af\3\24\3\24\3\25\3\25\4\u0097\u00a4\2\26\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26\3\2\7\3\2\62;\6\2\62;C\\aac|\4\2C\\c|\7\2\60\60\62;C\\aac|\5"+
		"\2\13\f\17\17\"\"\2\u00bb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2"+
		"\2\2\5\60\3\2\2\2\7\66\3\2\2\2\t<\3\2\2\2\13A\3\2\2\2\rH\3\2\2\2\17M\3"+
		"\2\2\2\21Q\3\2\2\2\23Z\3\2\2\2\25c\3\2\2\2\27j\3\2\2\2\31s\3\2\2\2\33"+
		"w\3\2\2\2\35|\3\2\2\2\37\u0085\3\2\2\2!\u008d\3\2\2\2#\u0091\3\2\2\2%"+
		"\u009e\3\2\2\2\'\u00ad\3\2\2\2)\u00b3\3\2\2\2+,\7T\2\2,-\7G\2\2-.\7C\2"+
		"\2./\7F\2\2/\4\3\2\2\2\60\61\7R\2\2\61\62\7T\2\2\62\63\7K\2\2\63\64\7"+
		"P\2\2\64\65\7V\2\2\65\6\3\2\2\2\66\67\7Y\2\2\678\7T\2\289\7K\2\29:\7V"+
		"\2\2:;\7G\2\2;\b\3\2\2\2<=\7L\2\2=>\7Q\2\2>?\7K\2\2?@\7P\2\2@\n\3\2\2"+
		"\2AB\7U\2\2BC\7G\2\2CD\7N\2\2DE\7G\2\2EF\7E\2\2FG\7V\2\2G\f\3\2\2\2HI"+
		"\7H\2\2IJ\7T\2\2JK\7Q\2\2KL\7O\2\2L\16\3\2\2\2MN\7C\2\2NO\7F\2\2OP\7F"+
		"\2\2P\20\3\2\2\2QR\7U\2\2RS\7W\2\2ST\7D\2\2TU\7V\2\2UV\7T\2\2VW\7C\2\2"+
		"WX\7E\2\2XY\7V\2\2Y\22\3\2\2\2Z[\7O\2\2[\\\7W\2\2\\]\7N\2\2]^\7V\2\2^"+
		"_\7K\2\2_`\7R\2\2`a\7N\2\2ab\7[\2\2b\24\3\2\2\2cd\7F\2\2de\7K\2\2ef\7"+
		"X\2\2fg\7K\2\2gh\7F\2\2hi\7G\2\2i\26\3\2\2\2jk\7U\2\2kl\7C\2\2lm\7X\2"+
		"\2mn\7G\2\2no\7\"\2\2op\7C\2\2pq\7N\2\2qr\7N\2\2r\30\3\2\2\2st\7/\2\2"+
		"tu\7@\2\2u\32\3\2\2\2vx\t\2\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2"+
		"\2z\34\3\2\2\2{}\t\3\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080\u0081\7\60\2\2\u0081\u0082\7e\2\2\u0082\u0083\7u"+
		"\2\2\u0083\u0084\7x\2\2\u0084\36\3\2\2\2\u0085\u0089\t\4\2\2\u0086\u0088"+
		"\t\3\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a \3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008e\t\5\2\2"+
		"\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\"\3\2\2\2\u0091\u0092\7\61\2\2\u0092\u0093\7\61\2\2\u0093"+
		"\u0097\3\2\2\2\u0094\u0096\13\2\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3"+
		"\2\2\2\u0097\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009a\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u009a\u009b\7\f\2\2\u009b\u009c\3\2\2\2\u009c\u009d\b\22"+
		"\2\2\u009d$\3\2\2\2\u009e\u009f\7\61\2\2\u009f\u00a0\7,\2\2\u00a0\u00a4"+
		"\3\2\2\2\u00a1\u00a3\13\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2"+
		"\u00a4\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a7\u00a8\7,\2\2\u00a8\u00a9\7\61\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ab\b\23\2\2\u00ab&\3\2\2\2\u00ac\u00ae\t\6\2\2\u00ad\u00ac\3\2\2\2"+
		"\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1"+
		"\3\2\2\2\u00b1\u00b2\b\24\2\2\u00b2(\3\2\2\2\u00b3\u00b4\13\2\2\2\u00b4"+
		"*\3\2\2\2\r\2y|~\u0087\u0089\u008d\u008f\u0097\u00a4\u00af\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}