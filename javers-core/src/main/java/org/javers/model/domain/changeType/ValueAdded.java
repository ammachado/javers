package org.javers.model.domain.changeType;

import org.javers.model.domain.GlobalCdoId;
import org.javers.model.domain.PropertyChange;
import org.javers.model.domain.Value;
import org.javers.model.mapping.Property;

/**
 * element added to collection
 *
 * @author bartosz walacik
 */
public class ValueAdded extends ValueAddOrRemove {

    public ValueAdded(GlobalCdoId globalCdoId, Property property, Object value) {
        super(globalCdoId, property, value);
    }

    public Value getAddedValue() {
        return value;
    }
}