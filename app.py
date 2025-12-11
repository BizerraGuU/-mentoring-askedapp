from fastapi import FastAPI

app = FastAPI()

restaurants = [
    {
        'restaurant_id': 1,
        'name': 'McDonalds',
        'rate': 5,
    },
    {
        'restaurant_id': 2,
        'name': 'Burguer King',
        'rate': 4,
    }
]
@app.get('/get-restaurants/{restaurant_id}')
def get_especific_restaurant(restaurant_id):
    for r in restaurants:
        if restaurant_id == restaurants[[r]['restaurant_id']]:
            return f'Restaurant data: {restaurants}'
