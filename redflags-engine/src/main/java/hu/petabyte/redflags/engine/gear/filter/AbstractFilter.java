/*
   Copyright 2014-2016 PetaByte Research Ltd.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package hu.petabyte.redflags.engine.gear.filter;

import hu.petabyte.redflags.engine.gear.AbstractGear;
import hu.petabyte.redflags.engine.model.Notice;

/**
 * @author Zsolt Jurányi
 */
public abstract class AbstractFilter extends AbstractGear {

	public abstract boolean accept(Notice notice) throws Exception;

	@Override
	protected Notice processImpl(Notice notice) throws Exception {
		return accept(notice) ? notice : null;
	}

}
