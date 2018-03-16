// Generated from Tradutor.g4 by ANTLR 4.7.1

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.Map;
import java.util.HashMap;

/**
* This class provides an empty implementation of {@link TradutorListener},
* which can be extended to create a listener which only needs to handle a subset
* of the available methods.
*/
public class BuildNumbersMapping extends TradutorBaseListener {

	// Instance Fields
	public Map<String, Integer> mappings = new HashMap<String, Integer>();

	// Could be used enterLine instead of exit line	@Override
	public void exitLine(TradutorParser.LineContext ctx) {
		String key = ctx.WORD().getText();
		Integer value = Integer.parseInt(ctx.NUMBER().getText());

		if(exists(key)) {
			System.err.println("ERROR: Key " + key+ " is repeated!");
			System.exit(1);
		}

		mappings.put(key, value);
		System.out.println("HELLO!!! Key " + key + " with value " + mappings.get(key) + " added");
	}

	// Aux methods
	public boolean exists(String key) {
		assert key != null;
		return mappings.containsKey(key);
	}

	public Integer getValue(String key) {
		assert key != null;
		assert exists(key);
		return mappings.get(key);
	}

}
