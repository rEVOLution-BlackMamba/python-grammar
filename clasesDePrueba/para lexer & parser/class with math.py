import warnings
from . import tasks
from .logg import logger
from .base_events import *
import math

class PriorityQueueBase: 
    def __init__ (self, k, v):
        self._key = k 
        self._value = v 

    def __lt__ (self, other):
        return self._key < other._key

    def is_empty(self): 
        return len(self) == 0 

math.floor(math.cos(2) + math.factorial(2))



