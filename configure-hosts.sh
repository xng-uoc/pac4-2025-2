#!/bin/sh

clab_name="clab-pac4-2025-1"

# Remove the default routes to ensure that routers and hosts are isolated
printf "Removing default routes from routers and hosts..."
sudo docker exec -d $clab_name-P01 ip route del default via 172.20.20.1
sudo docker exec -d $clab_name-P01 ip -6 route del default
sudo docker exec -d $clab_name-P02 ip route del default via 172.20.20.1
sudo docker exec -d $clab_name-P02 ip -6 route del default
sudo docker exec -d $clab_name-P03 ip route del default via 172.20.20.1
sudo docker exec -d $clab_name-P03 ip -6 route del default
sudo docker exec -d $clab_name-P04 ip route del default via 172.20.20.1
sudo docker exec -d $clab_name-P04 ip -6 route del default

sudo docker exec -d $clab_name-PE01 ip route del default via 172.20.20.1
sudo docker exec -d $clab_name-PE01 ip -6 route del default
sudo docker exec -d $clab_name-PE02 ip route del default via 172.20.20.1
sudo docker exec -d $clab_name-PE02 ip -6 route del default

sudo docker exec -d $clab_name-CE01 ip route del default via 172.20.20.1
sudo docker exec -d $clab_name-CE01 ip -6 route del default
sudo docker exec -d $clab_name-CE02 ip route del default via 172.20.20.1
sudo docker exec -d $clab_name-CE02 ip -6 route del default

sudo docker exec -d $clab_name-host01 ip route del default via 172.20.20.1
sudo docker exec -d $clab_name-host01 ip -6 route del default
sudo docker exec -d $clab_name-host01 ip addr add 192.168.1.2/24 dev eth1
sudo docker exec -d $clab_name-host01 ip route add default via 192.168.1.1

sudo docker exec -d $clab_name-host02 ip route del default via 172.20.20.1
sudo docker exec -d $clab_name-host02 ip -6 route del default
sudo docker exec -d $clab_name-host02 ip addr add 192.168.2.2/24 dev eth1
sudo docker exec -d $clab_name-host02 ip route add default via 192.168.2.1

printf " done!\n"
