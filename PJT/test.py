import requests
from pprint import pprint
# 서울의 위도 37.56, 경도 127.97
lat = 37.56
lon= 126.97
api_key='d6013fb063d20650eccfaa3b51cfeb0d'
url=f'https://api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={api_key}'
response=requests.get(url).json()
print(response)