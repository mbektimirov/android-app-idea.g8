#!/bin/sh

echo 'PATH=$PATH:~/bin' >> ~/.bashrc
curl https://raw.github.com/n8han/conscript/master/setup.sh | sh
cs n8han/giter8