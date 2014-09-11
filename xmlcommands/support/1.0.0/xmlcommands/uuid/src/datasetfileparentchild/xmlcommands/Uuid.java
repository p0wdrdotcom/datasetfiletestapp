package datasetfileparentchild.xmlcommands;

import com.aviarc.core.state.State;
import com.aviarc.framework.xml.command.AbstractAutoAttributeXMLCommand;

public class Uuid extends AbstractAutoAttributeXMLCommand {
    private static final long serialVersionUID = 0L;

	@Override
	public void perform(State s) {
		s.getExecutionState().setReturnValue(java.util.UUID.randomUUID().toString());
	}

}
