/*
Copyright 2008-2010 Gephi
Authors : Martin Škurla
Website : http://www.gephi.org

This file is part of Gephi.

Gephi is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as
published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.

Gephi is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with Gephi.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.gephi.neo4j.plugin.api;

/**
 *
 * @author Martin Škurla
 */
public interface Neo4jVisualDebugger {

    void nextStep(Neo4jDelegateNodeDebugger neo4jDelegateNodeDebugger) throws NoMoreElementsException;

    void update(Neo4jDelegateNodeDebugger neo4jDelegateNodeDebugger);

    void initialize();

    void restore();
}
