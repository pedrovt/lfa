// Generated from Calculator_v2.g4 by ANTLR 4.7.1

  import java.util.Map;
  import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Calculator_v2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, ID=8, INT=9, SPACES=10, 
		NEWLINE=11, COMMENTS=12;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_assignment = 2, RULE_expr = 3;
	public static final String[] ruleNames = {
		"program", "stat", "assignment", "expr"
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

	@Override
	public String getGrammarFileName() { return "Calculator_v2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  private static Map<String, Double> symbolTable = new HashMap<>();

	public Calculator_v2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Calculator_v2Parser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<TerminalNode> COMMENTS() { return getTokens(Calculator_v2Parser.COMMENTS); }
		public TerminalNode COMMENTS(int i) {
			return getToken(Calculator_v2Parser.COMMENTS, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Calculator_v2Listener ) ((Calculator_v2Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Calculator_v2Listener ) ((Calculator_v2Listener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << ID) | (1L << INT) | (1L << NEWLINE) | (1L << COMMENTS))) != 0)) {
				{
				{
				setState(11);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTS) {
					{
					{
					setState(8);
					match(COMMENTS);
					}
					}
					setState(13);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(14);
				stat();
				setState(18);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(15);
						match(COMMENTS);
						}
						} 
					}
					setState(20);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
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

	public static class StatContext extends ParserRuleContext {
		public AssignmentContext assignment;
		public ExprContext expr;
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(Calculator_v2Parser.NEWLINE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Calculator_v2Listener ) ((Calculator_v2Listener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Calculator_v2Listener ) ((Calculator_v2Listener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				((StatContext)_localctx).assignment = assignment();
				setState(29);
				match(NEWLINE);

				          System.out.println("Value is " + ((StatContext)_localctx).assignment.result);
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				((StatContext)_localctx).expr = expr(0);
				setState(33);
				match(NEWLINE);

				          System.out.println("Value is " + ((StatContext)_localctx).expr.result);
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				match(NEWLINE);
				}
				break;
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

	public static class AssignmentContext extends ParserRuleContext {
		public double result;
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(Calculator_v2Parser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Calculator_v2Listener ) ((Calculator_v2Listener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Calculator_v2Listener ) ((Calculator_v2Listener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			((AssignmentContext)_localctx).ID = match(ID);
			setState(40);
			match(T__0);
			setState(41);
			((AssignmentContext)_localctx).expr = expr(0);

			          String variableName = (((AssignmentContext)_localctx).ID!=null?((AssignmentContext)_localctx).ID.getText():null);

			          // Debug messages
			          if (symbolTable.containsKey(variableName)) System.err.print("Updated");
			          else System.err.print("Added");

			          // Update the symbol table and the return variable
			          ((AssignmentContext)_localctx).result =  ((AssignmentContext)_localctx).expr.result;
			          symbolTable.put(variableName, ((AssignmentContext)_localctx).expr.result);

			          // Debug message
			          System.err.println(" variable " + variableName + " with value " + symbolTable.get(variableName) + " to the symbol table");
			        
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

	public static class ExprContext extends ParserRuleContext {
		public double result;
		public ExprContext op1;
		public Token INT;
		public ExprContext expr;
		public Token ID;
		public Token op;
		public ExprContext op2;
		public TerminalNode INT() { return getToken(Calculator_v2Parser.INT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(Calculator_v2Parser.ID, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Calculator_v2Listener ) ((Calculator_v2Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Calculator_v2Listener ) ((Calculator_v2Listener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(45);
				((ExprContext)_localctx).INT = match(INT);

				            ((ExprContext)_localctx).result =  Double.parseDouble((((ExprContext)_localctx).INT!=null?((ExprContext)_localctx).INT.getText():null));
				        
				}
				break;
			case T__5:
				{
				setState(47);
				match(T__5);
				setState(48);
				((ExprContext)_localctx).expr = expr(0);
				setState(49);
				match(T__6);

				            ((ExprContext)_localctx).result =  ((ExprContext)_localctx).expr.result;
				        
				}
				break;
			case ID:
				{
				setState(52);
				((ExprContext)_localctx).ID = match(ID);

				          String variableName = (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null);
				          if(!symbolTable.containsKey(variableName)) {
				            System.err.println("ERROR: Variable " + variableName + " not found.");
				            System.exit(1);
				          }
				          ((ExprContext)_localctx).result =  symbolTable.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null));
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(66);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(56);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(57);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__1 || _la==T__2) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(58);
						((ExprContext)_localctx).op2 = ((ExprContext)_localctx).expr = expr(6);

						                      if ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null).equals("*")) ((ExprContext)_localctx).result =  ((ExprContext)_localctx).op1.result * ((ExprContext)_localctx).op2.result;
						                      else                    ((ExprContext)_localctx).result =  ((ExprContext)_localctx).op1.result / ((ExprContext)_localctx).op2.result;
						                  
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(61);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(62);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__3 || _la==T__4) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(63);
						((ExprContext)_localctx).op2 = ((ExprContext)_localctx).expr = expr(5);

						                      if ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null).equals("+")) ((ExprContext)_localctx).result =  ((ExprContext)_localctx).op1.result + ((ExprContext)_localctx).op2.result;
						                      else                    ((ExprContext)_localctx).result =  ((ExprContext)_localctx).op1.result - ((ExprContext)_localctx).op2.result;
						                  
						}
						break;
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16J\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\7\2\f\n\2\f\2\16\2\17\13\2\3\2\3\2\7\2\23\n\2\f"+
		"\2\16\2\26\13\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3(\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\59\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7"+
		"\5E\n\5\f\5\16\5H\13\5\3\5\2\3\b\6\2\4\6\b\2\4\3\2\4\5\3\2\6\7\2N\2\31"+
		"\3\2\2\2\4\'\3\2\2\2\6)\3\2\2\2\b8\3\2\2\2\n\f\7\16\2\2\13\n\3\2\2\2\f"+
		"\17\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16\20\3\2\2\2\17\r\3\2\2\2\20\24"+
		"\5\4\3\2\21\23\7\16\2\2\22\21\3\2\2\2\23\26\3\2\2\2\24\22\3\2\2\2\24\25"+
		"\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\27\r\3\2\2\2\30\33\3\2\2\2\31\27"+
		"\3\2\2\2\31\32\3\2\2\2\32\34\3\2\2\2\33\31\3\2\2\2\34\35\7\2\2\3\35\3"+
		"\3\2\2\2\36\37\5\6\4\2\37 \7\r\2\2 !\b\3\1\2!(\3\2\2\2\"#\5\b\5\2#$\7"+
		"\r\2\2$%\b\3\1\2%(\3\2\2\2&(\7\r\2\2\'\36\3\2\2\2\'\"\3\2\2\2\'&\3\2\2"+
		"\2(\5\3\2\2\2)*\7\n\2\2*+\7\3\2\2+,\5\b\5\2,-\b\4\1\2-\7\3\2\2\2./\b\5"+
		"\1\2/\60\7\13\2\2\609\b\5\1\2\61\62\7\b\2\2\62\63\5\b\5\2\63\64\7\t\2"+
		"\2\64\65\b\5\1\2\659\3\2\2\2\66\67\7\n\2\2\679\b\5\1\28.\3\2\2\28\61\3"+
		"\2\2\28\66\3\2\2\29F\3\2\2\2:;\f\7\2\2;<\t\2\2\2<=\5\b\5\b=>\b\5\1\2>"+
		"E\3\2\2\2?@\f\6\2\2@A\t\3\2\2AB\5\b\5\7BC\b\5\1\2CE\3\2\2\2D:\3\2\2\2"+
		"D?\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\t\3\2\2\2HF\3\2\2\2\t\r\24\31"+
		"\'8DF";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}