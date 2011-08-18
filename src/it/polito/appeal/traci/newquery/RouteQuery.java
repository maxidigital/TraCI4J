/*   
    Copyright (C) 2011 ApPeAL Group, Politecnico di Torino

    This file is part of TraCI4J.

    TraCI4J is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    TraCI4J is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with TraCI4J.  If not, see <http://www.gnu.org/licenses/>.
*/

/**
 * 
 */
package it.polito.appeal.traci.newquery;

import it.polito.appeal.traci.protocol.Constants;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.List;

public class RouteQuery extends ObjectCollectionQuery<Edge, List<Edge>> {

	RouteQuery(final DataInputStream dis, final DataOutputStream dos, String vehicleID) {
		super(dis, dos, Constants.CMD_GET_VEHICLE_VARIABLE, new ObjectFactory<Edge>() {

			@Override
			public Edge newObject(String objectID) {
				return new Edge(dis, dos, objectID);
			}
		}, vehicleID, Constants.VAR_EDGES);
	}

	@Override
	protected List<Edge> makeCollection() {
		return new ArrayList<Edge>();
	}
	
}