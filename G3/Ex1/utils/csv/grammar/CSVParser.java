// Generated from CSVParser.g4 by ANTLR 4.7.1

// --------------------------------
// CSVParser
// Formal and Automated Languages
// Pedro Teixeira, 84715, MIECT
// --------------------------------

package utils.csv.grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CSVParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMA=1, FIELD=2, EOL=3, WS=4, ERROR=5;
	public static final int
		RULE_file = 0, RULE_header = 1, RULE_row = 2;
	public static final String[] ruleNames = {
		"file", "header", "row"
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

	@Override
	public String getGrammarFileName() { return "CSVParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CSVParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CSVParser.EOF, 0); }
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSVParserListener ) ((CSVParserListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSVParserListener ) ((CSVParserListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSVParserVisitor ) return ((CSVParserVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			header();
			setState(10);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FIELD) {
				{
				{
				setState(7);
				row();
				}
				}
				setState(12);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(13);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeaderContext extends ParserRuleContext {
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSVParserListener ) ((CSVParserListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSVParserListener ) ((CSVParserListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSVParserVisitor ) return ((CSVParserVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			row();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowContext extends ParserRuleContext {
		public List<TerminalNode> FIELD() { return getTokens(CSVParser.FIELD); }
		public TerminalNode FIELD(int i) {
			return getToken(CSVParser.FIELD, i);
		}
		public TerminalNode EOL() { return getToken(CSVParser.EOL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CSVParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSVParser.COMMA, i);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSVParserListener ) ((CSVParserListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSVParserListener ) ((CSVParserListener)listener).exitRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSVParserVisitor ) return ((CSVParserVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(FIELD);
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(18);
				match(COMMA);
				setState(19);
				match(FIELD);
				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(25);
			match(EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7\36\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\7\2\13\n\2\f\2\16\2\16\13\2\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\4\7\4\27\n\4\f\4\16\4\32\13\4\3\4\3\4\3\4\2\2\5\2\4\6\2\2\2\34\2"+
		"\b\3\2\2\2\4\21\3\2\2\2\6\23\3\2\2\2\b\f\5\4\3\2\t\13\5\6\4\2\n\t\3\2"+
		"\2\2\13\16\3\2\2\2\f\n\3\2\2\2\f\r\3\2\2\2\r\17\3\2\2\2\16\f\3\2\2\2\17"+
		"\20\7\2\2\3\20\3\3\2\2\2\21\22\5\6\4\2\22\5\3\2\2\2\23\30\7\4\2\2\24\25"+
		"\7\3\2\2\25\27\7\4\2\2\26\24\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31"+
		"\3\2\2\2\31\33\3\2\2\2\32\30\3\2\2\2\33\34\7\5\2\2\34\7\3\2\2\2\4\f\30";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}