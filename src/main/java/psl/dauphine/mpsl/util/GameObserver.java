package psl.dauphine.mpsl.util;

import psl.dauphine.mpsl.base.grid.Grid;
import psl.dauphine.mpsl.base.grid.Line;
import psl.dauphine.mpsl.base.grid.Point;

import java.util.List;

public interface GameObserver {
    void update(Grid grid, List<Point> highlightPoints, List<Line> highlightLines);
}
