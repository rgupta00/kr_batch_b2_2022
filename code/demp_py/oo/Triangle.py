from oo.Polygon import Polygon

class Triangle(Polygon):
    def get_area(self):
        return 0.5*self.get_height()*self.get_width()