# Start with the minial image as a base
require minimal-nilrt-image.bb

# Change description
DESCRIPTION = " \
    Fully-featured run-mode image for LabVIEW Comms. Includes drivers, \
    daemons, and other utilities required for RT targets to interact \
    with Comms. \
"

# Append additional software
IMAGE_INSTALL_NODEPS += " \
    lvrt \
    niminionagent \
    ni-flexrio \
    ni-usrp-rio \
    ni-sync \
    ni-p2p \
    mt \
"
