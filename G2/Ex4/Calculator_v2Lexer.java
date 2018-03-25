// Generated from Calculator_v2.g4 by ANTLR 4.7.1

  import java.util.Map;
  import java.util.HashMap;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Calculator_v2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, ID=8, INT=9, SPACES=10, 
		NEWLINE=11, COMMENTS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "ID", "INT", "SPACES", 
		"NEWLINE", "COMMENTS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'*'", "'/'", "'+'", "'-'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "ID", "INT", "SPACES", 
		"NEWLINE", "COMMENTS"
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


	  private static Map<String, Double> symbolTable = new HashMap<>();


	public Calculator_v2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator_v2.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 11:
			COMMENTS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMMENTS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			                              // action for debugging purposes
			           System.out.println("Skipped comment: " + COMMENTS);
			         
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16L\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\6\t+\n\t\r\t\16\t,\3\n\6\n\60\n\n\r\n\16\n\61\3\13\6\13\65"+
		"\n\13\r\13\16\13\66\3\13\3\13\3\f\5\f<\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\7\rE\n\r\f\r\16\rH\13\r\3\r\3\r\3\r\3F\2\16\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\3\2\5\5\2C\\aac|\3\2\62;\4\2\13\13\""+
		"\"\2P\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\35\3\2\2\2\7\37\3\2\2\2\t!\3\2\2\2\13"+
		"#\3\2\2\2\r%\3\2\2\2\17\'\3\2\2\2\21*\3\2\2\2\23/\3\2\2\2\25\64\3\2\2"+
		"\2\27;\3\2\2\2\31?\3\2\2\2\33\34\7?\2\2\34\4\3\2\2\2\35\36\7,\2\2\36\6"+
		"\3\2\2\2\37 \7\61\2\2 \b\3\2\2\2!\"\7-\2\2\"\n\3\2\2\2#$\7/\2\2$\f\3\2"+
		"\2\2%&\7*\2\2&\16\3\2\2\2\'(\7+\2\2(\20\3\2\2\2)+\t\2\2\2*)\3\2\2\2+,"+
		"\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\22\3\2\2\2.\60\t\3\2\2/.\3\2\2\2\60\61\3"+
		"\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\24\3\2\2\2\63\65\t\4\2\2\64\63\3\2"+
		"\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\b\13\2\2"+
		"9\26\3\2\2\2:<\7\17\2\2;:\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\7\f\2\2>\30\3"+
		"\2\2\2?@\7/\2\2@A\7/\2\2AB\7\"\2\2BF\3\2\2\2CE\13\2\2\2DC\3\2\2\2EH\3"+
		"\2\2\2FG\3\2\2\2FD\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\5\27\f\2JK\b\r\3\2K\32"+
		"\3\2\2\2\b\2,\61\66;F\4\b\2\2\3\r\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}