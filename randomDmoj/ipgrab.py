#go through file vlan.txt and grab all the private ip addresses
import re
import sys
import os
import socket
import struct
import fcntl
import array
import subprocess
#package

f=open("vlan.txt","r")
for line in f:
    if re.match(".*\d+\.\d+\.\d+\.\d+.*",line):
        print(line)
f.close()