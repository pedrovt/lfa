// Generated from FracCalculatorLexer.g4 by ANTLR 4.7.1

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
public class FracCalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRINT=1, REDUCE=2, POWER=3, FRAC=4, INT=5, ID=6, DIVIDE=7, MULTIPLY=8, 
		ADD=9, SUBTRACT=10, ARROW=11, SEMICOLON=12, LPARENTESIS=13, RPARENTESIS=14, 
		COMMENTS=15, WS=16, ERROR=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PRINT", "REDUCE", "POWER", "FRAC", "INT", "ID", "DIVIDE", "MULTIPLY", 
		"ADD", "SUBTRACT", "ARROW", "SEMICOLON", "LPARENTESIS", "RPARENTESIS", 
		"COMMENTS", "WS", "ERROR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'print'", "'reduce'", null, null, null, null, "':'", "'*'", "'+'", 
		"'-'", "'->'", "';'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PRINT", "REDUCE", "POWER", "FRAC", "INT", "ID", "DIVIDE", "MULTIPLY", 
		"ADD", "SUBTRACT", "ARROW", "SEMICOLON", "LPARENTESIS", "RPARENTESIS", 
		"COMMENTS", "WS", "ERROR"
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


	public FracCalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FracCalculatorLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23n\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\5\59\n\5\3\6\5\6<\n\6\3\6\6\6?\n\6\r\6\16\6@\3\7\6\7D\n\7\r\7\16"+
		"\7E\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\7\20]\n\20\f\20\16\20`\13\20\3\20\3\20\3"+
		"\20\3\20\3\21\6\21g\n\21\r\21\16\21h\3\21\3\21\3\22\3\22\3^\2\23\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23\3\2\6\4\2--//\3\2\62;\3\2c|\5\2\13\f\17\17\"\"\2s\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2"+
		"\2\5+\3\2\2\2\7\62\3\2\2\2\t\65\3\2\2\2\13;\3\2\2\2\rC\3\2\2\2\17G\3\2"+
		"\2\2\21I\3\2\2\2\23K\3\2\2\2\25M\3\2\2\2\27O\3\2\2\2\31R\3\2\2\2\33T\3"+
		"\2\2\2\35V\3\2\2\2\37X\3\2\2\2!f\3\2\2\2#l\3\2\2\2%&\7r\2\2&\'\7t\2\2"+
		"\'(\7k\2\2()\7p\2\2)*\7v\2\2*\4\3\2\2\2+,\7t\2\2,-\7g\2\2-.\7f\2\2./\7"+
		"w\2\2/\60\7e\2\2\60\61\7g\2\2\61\6\3\2\2\2\62\63\7`\2\2\63\64\5\13\6\2"+
		"\64\b\3\2\2\2\658\5\13\6\2\66\67\7\61\2\2\679\5\13\6\28\66\3\2\2\289\3"+
		"\2\2\29\n\3\2\2\2:<\t\2\2\2;:\3\2\2\2;<\3\2\2\2<>\3\2\2\2=?\t\3\2\2>="+
		"\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\f\3\2\2\2BD\t\4\2\2CB\3\2\2\2"+
		"DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\16\3\2\2\2GH\7<\2\2H\20\3\2\2\2IJ\7,\2"+
		"\2J\22\3\2\2\2KL\7-\2\2L\24\3\2\2\2MN\7/\2\2N\26\3\2\2\2OP\7/\2\2PQ\7"+
		"@\2\2Q\30\3\2\2\2RS\7=\2\2S\32\3\2\2\2TU\7*\2\2U\34\3\2\2\2VW\7+\2\2W"+
		"\36\3\2\2\2XY\7\61\2\2YZ\7\61\2\2Z^\3\2\2\2[]\13\2\2\2\\[\3\2\2\2]`\3"+
		"\2\2\2^_\3\2\2\2^\\\3\2\2\2_a\3\2\2\2`^\3\2\2\2ab\7\f\2\2bc\3\2\2\2cd"+
		"\b\20\2\2d \3\2\2\2eg\t\5\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2"+
		"ij\3\2\2\2jk\b\21\2\2k\"\3\2\2\2lm\13\2\2\2m$\3\2\2\2\t\28;@E^h\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}