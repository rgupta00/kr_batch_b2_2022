from oo.Polygon import Polygon


class Rectangle(Polygon):
    def get_area(self):
        return self.get_height()*self.get_width()
