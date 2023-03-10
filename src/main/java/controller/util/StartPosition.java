package controller.util;

import jakarta.servlet.http.HttpServletRequest;

/**
 *  Class that has a methods to get the position with the pagination
 */
public class StartPosition {
    public static final int AMOUNT_MOVIE_ON_A_PAGE = 3;
    public final static String PAGE_NUMBER = "page";
    /**
     * @param req {@link HttpServletRequest}.
     * @return start position for pagination
     */
    public static int getStartPosition(HttpServletRequest req) {
        int page = 0;
        req.setAttribute("movieOnPage", AMOUNT_MOVIE_ON_A_PAGE);
        if ((req.getParameter(PAGE_NUMBER) != null)) {
            page = Integer.parseInt(req.getParameter(PAGE_NUMBER));
        }
        req.setAttribute("currentPage",page);

        return page * AMOUNT_MOVIE_ON_A_PAGE;

    }
}
