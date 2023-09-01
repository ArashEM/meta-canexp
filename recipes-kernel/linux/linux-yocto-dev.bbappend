FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# tinker-board and tinker-board-s. rk3288 covers both
SRC_URI_append_rk3288 = " \
        file://0001-add-mcp2515-interface.patch \
        file://enable-isotp.cfg \
"

