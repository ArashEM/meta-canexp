SUMMARY = "Server to access CAN sockets over ASCII protocol"
HOMEPAGE = "https://github.com/linux-can/socketcand/tree/master"
SECTION = "libs/network"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

DEPENDS = "libsocketcan"

SRC_URI = "git://github.com/linux-can/socketcand.git;protocol=https;branch=master"
SRCREV = "0.6.1"
PV = "0.6.1+git${SRCPV}"

S = "${WORKDIR}/git"

inherit autotools pkgconfig update-rc.d

INITSCRIPT_NAME = "socketcand"
INITSCRIPT_PARAMS = "start 02 5 3 2 . stop 20 0 1 6 ."

EXTRA_OECONF_append = " --without-config"
