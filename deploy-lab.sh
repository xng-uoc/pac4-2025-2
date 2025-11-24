#!/bin/bash

# Make sure VRF module is loadad
modprobe vrf

# Make sure that SRv6 is enabled in the host kernel
sysctl -w net.ipv6.conf.default.seg6_enabled=1
sysctl -w net.ipv6.conf.all.seg6_enabled=1
sysctl -w net.vrf.strict_mode=1

# Deploy the Containerlab topology
clab deploy --topo  test-srv6.yml

# Finish configuring the network devices and hosts
./configure-hosts.sh
