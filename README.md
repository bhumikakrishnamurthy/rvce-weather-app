# Weather application for 1st semester project submission


## Setup

### Cleanup

### Database
- Find and stop any running container <br/>
```docker container stop $(docker container ls --all --quiet --filter "name=postgres")``` <br/>
<br/> Kill the stopped container <br/>
```docker container rm $(docker container ls --all --quiet --filter "name=postgres")``` <br/><br/>

- Stop and re-create a database container <br/>
```docker run -d -p 5432:5432 --name postgres -e POSTGRES_PASSWORD=password -e POSTGRES_USER=postgres -e POSTGRES_DB=postgres postgres -c 'max_connections=400'``` <br/>


- Execute into database container (if necessary) <br />
```docker exec -it postgres psql -U postgres -W postgres```

### User interface

### Runtime
` http://localhost:8080/index.hmtl `

