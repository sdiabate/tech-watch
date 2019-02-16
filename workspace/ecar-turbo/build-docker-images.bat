docker build -f Dockerfile.root -t ecar-turbo .
docker build -f Dockerfile.config -t ecar-turbo-config .
docker build -f Dockerfile.discovery -t ecar-turbo-discovery .
docker build -f Dockerfile.gateway -t ecar-turbo-gateway .
docker build -f Dockerfile.acquisition -t ecar-turbo-acquisition .
docker build -f Dockerfile.distribution -t ecar-turbo-distribution .

pause