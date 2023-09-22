SUMMARY = "Server to access CAN sockets over ASCII protocol"
HOMEPAGE = "https://github.com/linux-can/socketcand/tree/master"
SECTION = "libs/network"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

DEPENDS = "libsocketcan"

SRC_URI = "git://github.com/linux-can/socketcand.git;protocol=https;branch=master"
SRCREV = "0.6.1"
PV = "0.6.1+git${SRCPV}"

S = "${WORKDIR}/git"

inherit autotools pkgconfig update-rc.d

INITSCRIPT_NAME = "socketcand"
INITSCRIPT_PARAMS = "start 02 5 3 2 . stop 20 0 1 6 ."

EXTRA_OECONF_append = " --without-config"
