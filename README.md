# RedisInSpring

### Why Redis server?
1. In memory db, so retrieve data faster
2. Used as cache to store data temporarily to provide faster access to frequently used data

### Caching
1. After applying cache when the API is hit for the 1st time, it extracts data from db and save to the cache, so takes longer time

![image](https://github.com/user-attachments/assets/50e4edc9-67a5-4578-b99e-ee4f1a6ca9fe)

![image](https://github.com/user-attachments/assets/6a58ef6f-6814-49f4-bfa0-a6dc57b03ec4)


2. Wnen the API is hit for the 2nd time, if the same data is to be retrieved that was cached before, it will come from the cache and not be extracted from the db, so takes less time

![image](https://github.com/user-attachments/assets/374991ae-cee9-49ed-8be8-e7ecf9b0ff43)

![image](https://github.com/user-attachments/assets/fff590d0-70ae-43e6-be23-89170b7056d8)
