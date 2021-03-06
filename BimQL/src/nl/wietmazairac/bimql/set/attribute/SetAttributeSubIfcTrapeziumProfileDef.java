package nl.wietmazairac.bimql.set.attribute;

/******************************************************************************
 * Copyright (C) 2009-2017  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see {@literal<http://www.gnu.org/licenses/>}.
 *****************************************************************************/

import org.bimserver.models.ifc2x3tc1.IfcTrapeziumProfileDef;

public class SetAttributeSubIfcTrapeziumProfileDef {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcTrapeziumProfileDef() {
	}

	public SetAttributeSubIfcTrapeziumProfileDef(Object object, String attributeName, String attributeNewValue) {
		this.object = object;
		this.attributeName = attributeName;
		this.attributeNewValue = attributeNewValue;
	}

	// methods
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getAttributeNewValue() {
		return attributeNewValue;
	}

	public void setAttributeNewValue(String attributeNewValue) {
		this.attributeNewValue = attributeNewValue;
	}

	public void setAttribute() {
		if (attributeName.equals("YDimAsString")) {
			//1NoEList
			((IfcTrapeziumProfileDef) object).setYDimAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("TopXDim")) {
			//1NoEList
			((IfcTrapeziumProfileDef) object).setTopXDim(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("BottomXDim")) {
			//1NoEList
			((IfcTrapeziumProfileDef) object).setBottomXDim(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("TopXDimAsString")) {
			//1NoEList
			((IfcTrapeziumProfileDef) object).setTopXDimAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("TopXOffset")) {
			//1NoEList
			((IfcTrapeziumProfileDef) object).setTopXOffset(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("BottomXDimAsString")) {
			//1NoEList
			((IfcTrapeziumProfileDef) object).setBottomXDimAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("TopXOffsetAsString")) {
			//1NoEList
			((IfcTrapeziumProfileDef) object).setTopXOffsetAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("YDim")) {
			//1NoEList
			((IfcTrapeziumProfileDef) object).setYDim(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("Position")) {
			//2NoEList
			 //2void
			 //2IfcAxis2Placement2D
		}
		else if (attributeName.equals("ProfileName")) {
			//5NoEList
			((IfcTrapeziumProfileDef) object).setProfileName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("ProfileType")) {
			//5NoEList
			 //5void
			 //5IfcProfileTypeEnum
		}
		else {
		}
	}
}
