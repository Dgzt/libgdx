/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.badlogic.gdx.backends.iosmoe.objectal;

import com.intel.moe.natj.c.StructObject;
import com.intel.moe.natj.c.ann.Structure;
import com.intel.moe.natj.c.ann.StructureField;
import com.intel.moe.natj.general.NatJ;
import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class ALVector extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public ALVector() {
		super(ALVector.class);
	}

	@Generated
	protected ALVector(Pointer peer) {
		super(peer);
	}

	@Generated
	public ALVector(float x, float y, float z) {
		super(ALVector.class);
		setX(x);
		setY(y);
		setZ(z);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native float x();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setX(float value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native float y();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setY(float value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native float z();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setZ(float value);
}