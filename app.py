from fastapi import FastAPI

app = FastAPI()

restaurants = [
    {
        'restaurant_id': 1,
        'name': 'McDonalds',
        'rate': '5',
        'open_status': False,
    },
    {
        'restaurant_id': 2,
        'name': 'Burguer King',
        'rate': '4',
        'open_status': True,
    }
]

@app.get('/')
def root():
    return { 'message': 'Home page' }

@app.get('/get-restaurants/')
def get_restaurant():
    return restaurants

@app.get('/get-restaurants/{restaurant_id}')
def get_specific_restaurant(restaurant_id: int):
    for r in restaurants:
        if r['restaurant_id'] == restaurant_id:
            return r

@app.patch('/change_restaurant_status/{restaurant_id}')
def change_status(restaurant_id : int):
    for r in restaurants:
        if r['restaurant_id'] == restaurant_id:
            r['open_status'] != r['open_status']
            return r
