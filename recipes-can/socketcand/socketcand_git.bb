SUMMARY = "Server to access CAN sockets over ASCII protocol"
HOMEPAGE = "https://github.com/linux-can/socketcand/tree/master"
SECTION = "libs/network"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "git://github.com/linux-can/socketcand.git;protocol=https;branch=master"
SRCREV = "0.6.1"
PV = "0.6.1+git${SRCPV}"

S = "${WORKDIR}/git"

inherit autotools pkgconfig

EXTRA_OECONF_append = " --without-config"
