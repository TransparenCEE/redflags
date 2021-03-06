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
package hu.petabyte.redflags.web.ctrl;

import hu.petabyte.redflags.web.svc.FiltersSvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Zsolt Jurányi
 */
@Controller
public class FiltersCtrl {

	private @Autowired FiltersSvc filters;

	@RequestMapping("/filters")
	public String filters(Map<String, Object> m) {
		m.put("filters", filters.getFilters());
		m.put("pageTitleLabel", "filters.list");
		m.put("prevPageTitleLabel", "notices.title");
		m.put("prevPageUrl", "/notices");
		return "filters";
	}
}
