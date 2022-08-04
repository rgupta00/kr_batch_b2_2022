#some basic of inher
class Polygon:
    __width=None
    __height=None
    def set_value(self, w, h):
        self.__width=w
        self.__height=h
    def get_height(self):
        return self.__height
    def get_width(self):
        return self.__width