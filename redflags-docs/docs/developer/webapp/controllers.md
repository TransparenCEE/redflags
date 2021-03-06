# Controllers of the RED FLAGS webapp

Below I list the controllers with a short description and the URLs they map.



## ChartCtrl (RestController)

Provides JSON data for the charts displayed on the front page.

URL                     | Description
------------------------|------------
`/charts/flagCounts`    | Data for the donut chart
`/chart/flaggedNotices` | Data for the area chart
`/chart/sumValues`      | Data for the bar chart



## FilterCtrl

Handles requests of filter edit pages.

URL                   | Description
----------------------|------------
`/filter/delete/{id}` | Initiates the deletion of the specified filter then redirects to `/filters`
`GET /filter/{id}`    | Displays the edit page of a filter
`POST /filter/{id}`   | Initiates modification of the specified filter then redirects to `/filters`



## FilterEmailCtrl (RestController)

Receives trigger to send subscription emails.

URL                   | Description
----------------------|------------
`/send-filter-emails` | Initiates sending of subscription letters and returns with `true` or `false` based on success



## FiltersCtrl

Displays the saved filters list.

URL        | Description
-----------|------------
`/filters` | Displays the saved filters list page



## IndexCtrl

Serves the front page and related stuff.

URL           | Description
--------------|------------
`/`           | Displays the front page
`/*`          | Redirects every non-mapped URLs to `/`
`/robots.txt` | Serves `robots.txt`
`/version`    | Displays version information



## NoticeCtrl

Serves notice pages.

URL            | Description
---------------|------------
`/notice`      | Redirects to `/notices`
`/notice/`     | Redirects to `/notices`
`/notice/{id}` | Displays notice page for the given notice ID



## NoticesCtrl

Serves notice list pages.

URL                               | Description
----------------------------------|------------
`/notices`                        | Redirects to `/notices/10/1/by-date`
`/notices/`                       | Redirects to `/notices/10/1/by-date`
`/notices/{count}`                | Redirects to `/notices/{count}/1/by-date`
`/notices/{count}/`               | Redirects to `/notices/{count}/1/by-date`
`/notices/{count}/{page}`         | Redirects to `/notices/{count}/{page}/by-date`
`/notices/{count}/{page}/{order}` | Validates parameters, gathers filtered data, builds model and displays list page



## OrganizationCtrl

Serves organization pages.

URL                  | Description
---------------------|------------
`/organization`      | Redirects to `/organizations`
`/organization/`     | Redirects to `/organizations`
`/organization/{id}` | Displays organization page for the given organization ID



## OrganizationsCtrl

Serves organization list pages.

URL                             | Description
--------------------------------|------------
`/organizations`                | Redirects to `/organizations/10/1`
`/organizations/`               | Redirects to `/organizations/10/1`
`/organizations/{count}`        | Redirects to `/organizations/{count}/1`
`/organizations/{count}/`       | Redirects to `/organizations/{count}/1`
`/organizations/{count}/{page}` | Validates parameters, gathers filtered data, builds model and displays list page



## SecuritySvc

Handles requests related to user accounts.

URL                                 | Description
------------------------------------|------------
`/activate/{id}/{token}`            | Initiates user account activation then displays login page
`GET /change-password/{id}/{token}` | Displays password changer page
`POST /change-password`             | Saves new password then displays login page
`GET /forgot`                       | Displays forgotten password page
`POST /forgot`                      | Initiates password change then displays forgotten password page
`/login`                            | Displays login page
`GET /register`                     | Displays registration page
`POST /register`                    | Initiates registration then displays registration