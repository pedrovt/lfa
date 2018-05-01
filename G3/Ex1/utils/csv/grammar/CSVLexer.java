// Generated from CSVLexer.g4 by ANTLR 4.7.1

// --------------------------------
// CSVLexer
// Formal and Automated Languages
// Pedro Teixeira, 84715, MIECT
// --------------------------------

package utils.csv.grammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CSVLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMA=1, FIELD=2, EOL=3, WS=4, ERROR=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"COMMA", "FIELD", "TEXT", "TEXT_BETWEEN_QUOTE_MARKS", "EOL", "WS", "ERROR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMA", "FIELD", "EOL", "WS", "ERROR"
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


	public CSVLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CSVLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\7@\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\5\3\26"+
		"\n\3\3\4\6\4\31\n\4\r\4\16\4\32\3\5\7\5\36\n\5\f\5\16\5!\13\5\3\5\3\5"+
		"\3\5\3\5\7\5\'\n\5\f\5\16\5*\13\5\3\5\3\5\7\5.\n\5\f\5\16\5\61\13\5\3"+
		"\6\5\6\64\n\6\3\6\3\6\3\7\6\79\n\7\r\7\16\7:\3\7\3\7\3\b\3\b\2\2\t\3\3"+
		"\5\4\7\2\t\2\13\5\r\6\17\7\3\2\5\6\2\f\f\17\17$$..\3\2$$\5\2\13\f\17\17"+
		"\"\"\2E\2\3\3\2\2\2\2\5\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\3\21\3\2\2\2\5\25\3\2\2\2\7\30\3\2\2\2\t\37\3\2\2\2\13\63\3\2\2\2\r8"+
		"\3\2\2\2\17>\3\2\2\2\21\22\7.\2\2\22\4\3\2\2\2\23\26\5\7\4\2\24\26\5\t"+
		"\5\2\25\23\3\2\2\2\25\24\3\2\2\2\26\6\3\2\2\2\27\31\n\2\2\2\30\27\3\2"+
		"\2\2\31\32\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\b\3\2\2\2\34\36\5\7"+
		"\4\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37"+
		"\3\2\2\2\"(\7$\2\2#$\7$\2\2$\'\7$\2\2%\'\n\3\2\2&#\3\2\2\2&%\3\2\2\2\'"+
		"*\3\2\2\2(&\3\2\2\2()\3\2\2\2)+\3\2\2\2*(\3\2\2\2+/\7$\2\2,.\5\7\4\2-"+
		",\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\n\3\2\2\2\61/\3\2\2\2\62"+
		"\64\7\17\2\2\63\62\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\7\f\2\2\66"+
		"\f\3\2\2\2\679\t\4\2\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;<\3\2"+
		"\2\2<=\b\7\2\2=\16\3\2\2\2>?\13\2\2\2?\20\3\2\2\2\13\2\25\32\37&(/\63"+
		":\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}