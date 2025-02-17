package com.appsmith.external.constants.spans.ce;

public class PageSpanCE {
    public static final String PAGES = "pages.";
    public static final String GET_PAGE = PAGES + "getpage";
    public static final String GET_PAGE_WITHOUT_BRANCH = PAGES + "without_branch";
    public static final String GET_PAGE_WITH_BRANCH = PAGES + "with_branch";
    public static final String FETCH_PAGE_FROM_DB = PAGES + "fetch_page";

    public static final String FETCH_PAGES_BY_APP_ID_DB = PAGES + "fetch_pages_by_app_id";
    public static final String MARK_RECENTLY_ACCESSED_RESOURCES_PAGES = PAGES + "update_recently_accessed_pages";
    public static final String PREPARE_APPLICATION_PAGES_DTO_FROM_PAGES = PAGES + "generate_app_pages_dto";
    public static final String MIGRATE_DSL = PAGES + "migrate_dsl";
}
