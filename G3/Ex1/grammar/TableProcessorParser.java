// Generated from TableProcessorParser.g4 by ANTLR 4.7.1

// --------------------------------
// Bloco 3, Ex. 1
// TableProcessorParser
// Formal and Automated Languages
// Pedro Teixeira, 84715, MIECT
// --------------------------------

package grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TableProcessorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		READ=1, PRINT=2, WRITE=3, JOIN=4, SELECT=5, FROM=6, ADD=7, SUBTRACT=8, 
		MULTIPLY=9, DIVIDE=10, SAVEALL=11, ARROW=12, INT=13, C_FILE_NAME=14, ID=15, 
		FILE_NAME=16, LINE_COMMENT=17, COMMENT=18, WS=19, ERROR=20;
	public static final int
		RULE_program = 0, RULE_instr = 1, RULE_save = 2, RULE_assign = 3, RULE_read = 4, 
		RULE_print = 5, RULE_write = 6, RULE_join = 7, RULE_select = 8, RULE_oper = 9, 
		RULE_table = 10;
	public static final String[] ruleNames = {
		"program", "instr", "save", "assign", "read", "print", "write", "join", 
		"select", "oper", "table"
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

	@Override
	public String getGrammarFileName() { return "TableProcessorParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TableProcessorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TableProcessorParser.EOF, 0); }
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TableProcessorParserListener ) ((TableProcessorParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TableProcessorParserListener ) ((TableProcessorParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TableProcessorParserVisitor ) return ((TableProcessorParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << READ) | (1L << PRINT) | (1L << WRITE) | (1L << JOIN) | (1L << SELECT) | (1L << ADD) | (1L << SUBTRACT) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << SAVEALL) | (1L << ID))) != 0)) {
				{
				{
				setState(22);
				instr();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
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

	public static class InstrContext extends ParserRuleContext {
		public SaveContext save() {
			return getRuleContext(SaveContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public JoinContext join() {
			return getRuleContext(JoinContext.class,0);
		}
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public OperContext oper() {
			return getRuleContext(OperContext.class,0);
		}
		public InstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TableProcessorParserListener ) ((TableProcessorParserListener)listener).enterInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TableProcessorParserListener ) ((TableProcessorParserListener)listener).exitInstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TableProcessorParserVisitor ) return ((TableProcessorParserVisitor<? extends T>)visitor).visitInstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrContext instr() throws RecognitionException {
		InstrContext _localctx = new InstrContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SAVEALL:
				{
				setState(30);
				save();
				}
				break;
			case ID:
				{
				setState(31);
				assign();
				}
				break;
			case READ:
				{
				setState(32);
				read();
				}
				break;
			case PRINT:
				{
				setState(33);
				print();
				}
				break;
			case WRITE:
				{
				setState(34);
				write();
				}
				break;
			case JOIN:
				{
				setState(35);
				join();
				}
				break;
			case SELECT:
				{
				setState(36);
				select();
				}
				break;
			case ADD:
			case SUBTRACT:
			case MULTIPLY:
			case DIVIDE:
				{
				setState(37);
				oper();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class SaveContext extends ParserRuleContext {
		public TerminalNode SAVEALL() { return getToken(TableProcessorParser.SAVEALL, 0); }
		public TerminalNode FILE_NAME() { return getToken(TableProcessorParser.FILE_NAME, 0); }
		public SaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_save; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TableProcessorParserListener ) ((TableProcessorParserListener)listener).enterSave(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TableProcessorParserListener ) ((TableProcessorParserListener)listener).exitSave(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TableProcessorParserVisitor ) return ((TableProcessorParserVisitor<? extends T>)visitor).visitSave(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SaveContext save() throws RecognitionException {
		SaveContext _localctx = new SaveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_save);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(SAVEALL);
			setState(41);
			match(FILE_NAME);
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TableProcessorParser.ID, 0); }
		public TerminalNode ARROW() { return getToken(TableProcessorParser.ARROW, 0); }
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TableProcessorParserListener ) ((TableProcessorParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TableProcessorParserListener ) ((TableProcessorParserListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TableProcessorParserVisitor ) return ((TableProcessorParserVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(ID);
			setState(44);
			match(ARROW);
			setState(45);
			table();
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(TableProcessorParser.READ, 0); }
		public TerminalNode C_FILE_NAME() { return getToken(TableProcessorParser.C_FILE_NAME, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TableProcessorParserListener ) ((TableProcessorParserListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TableProcessorParserListener ) ((TableProcessorParserListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TableProcessorParserVisitor ) return ((TableProcessorParserVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(READ);
			setState(48);
			match(C_FILE_NAME);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(TableProcessorParser.PRINT, 0); }
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TableProcessorParserListener ) ((TableProcessorParserListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TableProcessorParserListener ) ((TableProcessorParserListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TableProcessorParserVisitor ) return ((TableProcessorParserVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(PRINT);
			setState(51);
			table();
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

	public static class WriteContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(TableProcessorParser.WRITE, 0); }
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TableProcessorParserListener ) ((TableProcessorParserListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TableProcessorParserListener ) ((TableProcessorParserListener)listener).exitWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TableProcessorParserVisitor ) return ((TableProcessorParserVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(WRITE);
			setState(54);
			table();
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

	public static class JoinContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(TableProcessorParser.JOIN, 0); }
		public List<TableContext> table() {
			return getRuleContexts(TableContext.class);
		}
		public TableContext table(int i) {
			return getRuleContext(TableContext.class,i);
		}
		public JoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TableProcessorParserListener ) ((TableProcessorParserListener)listener).enterJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TableProcessorParserListener ) ((TableProcessorParserListener)listener).exitJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TableProcessorParserVisitor ) return ((TableProcessorParserVisitor<? extends T>)visitor).visitJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinContext join() throws RecognitionException {
		JoinContext _localctx = new JoinContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_join);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(JOIN);
			setState(57);
			table();
			setState(58);
			table();
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

	public static class SelectContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(TableProcessorParser.SELECT, 0); }
		public TerminalNode INT() { return getToken(TableProcessorParser.INT, 0); }
		public TerminalNode FROM() { return getToken(TableProcessorParser.FROM, 0); }
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public TerminalNode ID() { return getToken(TableProcessorParser.ID, 0); }
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TableProcessorParserListener ) ((TableProcessorParserListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TableProcessorParserListener ) ((TableProcessorParserListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TableProcessorParserVisitor ) return ((TableProcessorParserVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_select);
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(SELECT);
				setState(61);
				match(INT);
				setState(62);
				match(FROM);
				setState(63);
				table();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(SELECT);
				setState(65);
				match(ID);
				setState(66);
				match(FROM);
				setState(67);
				table();
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

	public static class OperContext extends ParserRuleContext {
		public OperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oper; }
	 
		public OperContext() { }
		public void copyFrom(OperContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperAddSubtractContext extends OperContext {
		public List<TableContext> table() {
			return getRuleContexts(TableContext.class);
		}
		public TableContext table(int i) {
			return getRuleContext(TableContext.class,i);
		}
		public TerminalNode ADD() { return getToken(TableProcessorParser.ADD, 0); }
		public TerminalNode SUBTRACT() { return getToken(TableProcessorParser.SUBTRACT, 0); }
		public OperAddSubtractContext(OperContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TableProcessorParserListener ) ((TableProcessorParserListener)listener).enterOperAddSubtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TableProcessorParserListener ) ((TableProcessorParserListener)listener).exitOperAddSubtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TableProcessorParserVisitor ) return ((TableProcessorParserVisitor<? extends T>)visitor).visitOperAddSubtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperDivideMultiplyContext extends OperContext {
		public List<TableContext> table() {
			return getRuleContexts(TableContext.class);
		}
		public TableContext table(int i) {
			return getRuleContext(TableContext.class,i);
		}
		public TerminalNode DIVIDE() { return getToken(TableProcessorParser.DIVIDE, 0); }
		public TerminalNode MULTIPLY() { return getToken(TableProcessorParser.MULTIPLY, 0); }
		public OperDivideMultiplyContext(OperContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TableProcessorParserListener ) ((TableProcessorParserListener)listener).enterOperDivideMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TableProcessorParserListener ) ((TableProcessorParserListener)listener).exitOperDivideMultiply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TableProcessorParserVisitor ) return ((TableProcessorParserVisitor<? extends T>)visitor).visitOperDivideMultiply(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperContext oper() throws RecognitionException {
		OperContext _localctx = new OperContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_oper);
		int _la;
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTIPLY:
			case DIVIDE:
				_localctx = new OperDivideMultiplyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				_la = _input.LA(1);
				if ( !(_la==MULTIPLY || _la==DIVIDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(71);
				table();
				setState(72);
				table();
				}
				break;
			case ADD:
			case SUBTRACT:
				_localctx = new OperAddSubtractContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUBTRACT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(75);
				table();
				setState(76);
				table();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TableContext extends ParserRuleContext {
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
	 
		public TableContext() { }
		public void copyFrom(TableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableSelectContext extends TableContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public TableSelectContext(TableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TableProcessorParserListener ) ((TableProcessorParserListener)listener).enterTableSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TableProcessorParserListener ) ((TableProcessorParserListener)listener).exitTableSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TableProcessorParserVisitor ) return ((TableProcessorParserVisitor<? extends T>)visitor).visitTableSelect(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableOperContext extends TableContext {
		public OperContext oper() {
			return getRuleContext(OperContext.class,0);
		}
		public TableOperContext(TableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TableProcessorParserListener ) ((TableProcessorParserListener)listener).enterTableOper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TableProcessorParserListener ) ((TableProcessorParserListener)listener).exitTableOper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TableProcessorParserVisitor ) return ((TableProcessorParserVisitor<? extends T>)visitor).visitTableOper(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableReadContext extends TableContext {
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public TableReadContext(TableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TableProcessorParserListener ) ((TableProcessorParserListener)listener).enterTableRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TableProcessorParserListener ) ((TableProcessorParserListener)listener).exitTableRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TableProcessorParserVisitor ) return ((TableProcessorParserVisitor<? extends T>)visitor).visitTableRead(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableVariableContext extends TableContext {
		public TerminalNode ID() { return getToken(TableProcessorParser.ID, 0); }
		public TableVariableContext(TableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TableProcessorParserListener ) ((TableProcessorParserListener)listener).enterTableVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TableProcessorParserListener ) ((TableProcessorParserListener)listener).exitTableVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TableProcessorParserVisitor ) return ((TableProcessorParserVisitor<? extends T>)visitor).visitTableVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableJoinContext extends TableContext {
		public JoinContext join() {
			return getRuleContext(JoinContext.class,0);
		}
		public TableJoinContext(TableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TableProcessorParserListener ) ((TableProcessorParserListener)listener).enterTableJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TableProcessorParserListener ) ((TableProcessorParserListener)listener).exitTableJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TableProcessorParserVisitor ) return ((TableProcessorParserVisitor<? extends T>)visitor).visitTableJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_table);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
				_localctx = new TableReadContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				read();
				}
				break;
			case JOIN:
				_localctx = new TableJoinContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				join();
				}
				break;
			case SELECT:
				_localctx = new TableSelectContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				select();
				}
				break;
			case ADD:
			case SUBTRACT:
			case MULTIPLY:
			case DIVIDE:
				_localctx = new TableOperContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				oper();
				}
				break;
			case ID:
				_localctx = new TableVariableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26Z\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3)\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nG\n\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13Q\n\13\3\f\3\f\3\f\3\f\3"+
		"\f\5\fX\n\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\4\3\2\13\f\3\2\t\n"+
		"\2\\\2\33\3\2\2\2\4(\3\2\2\2\6*\3\2\2\2\b-\3\2\2\2\n\61\3\2\2\2\f\64\3"+
		"\2\2\2\16\67\3\2\2\2\20:\3\2\2\2\22F\3\2\2\2\24P\3\2\2\2\26W\3\2\2\2\30"+
		"\32\5\4\3\2\31\30\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34"+
		"\36\3\2\2\2\35\33\3\2\2\2\36\37\7\2\2\3\37\3\3\2\2\2 )\5\6\4\2!)\5\b\5"+
		"\2\")\5\n\6\2#)\5\f\7\2$)\5\16\b\2%)\5\20\t\2&)\5\22\n\2\')\5\24\13\2"+
		"( \3\2\2\2(!\3\2\2\2(\"\3\2\2\2(#\3\2\2\2($\3\2\2\2(%\3\2\2\2(&\3\2\2"+
		"\2(\'\3\2\2\2)\5\3\2\2\2*+\7\r\2\2+,\7\22\2\2,\7\3\2\2\2-.\7\21\2\2./"+
		"\7\16\2\2/\60\5\26\f\2\60\t\3\2\2\2\61\62\7\3\2\2\62\63\7\20\2\2\63\13"+
		"\3\2\2\2\64\65\7\4\2\2\65\66\5\26\f\2\66\r\3\2\2\2\678\7\5\2\289\5\26"+
		"\f\29\17\3\2\2\2:;\7\6\2\2;<\5\26\f\2<=\5\26\f\2=\21\3\2\2\2>?\7\7\2\2"+
		"?@\7\17\2\2@A\7\b\2\2AG\5\26\f\2BC\7\7\2\2CD\7\21\2\2DE\7\b\2\2EG\5\26"+
		"\f\2F>\3\2\2\2FB\3\2\2\2G\23\3\2\2\2HI\t\2\2\2IJ\5\26\f\2JK\5\26\f\2K"+
		"Q\3\2\2\2LM\t\3\2\2MN\5\26\f\2NO\5\26\f\2OQ\3\2\2\2PH\3\2\2\2PL\3\2\2"+
		"\2Q\25\3\2\2\2RX\5\n\6\2SX\5\20\t\2TX\5\22\n\2UX\5\24\13\2VX\7\21\2\2"+
		"WR\3\2\2\2WS\3\2\2\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2X\27\3\2\2\2\7\33(F"+
		"PW";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}