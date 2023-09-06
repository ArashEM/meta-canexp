# Introduction 
This layer helps you to add `mcp2515` module into ASUS-Tinker board.

# Getting started
1. Clone required layers:
```bash
git clone git://git.yoctoproject.org/poky -b dunfell
cd poky/
git clone https://github.com/openembedded/meta-openembedded.git -b dunfell
git clone https://github.com/ArashEM/meta-canexp.git -b dunfell
cd ../
```
2. Export template configuraiton path and initialize build envrionment
```bash
export TEMPLATECONF=${TEMPLATECONF:-meta-canexp/conf}
source poky/oe-init-build-env tinker-board/
```
3. Start build process
```bash
bitbake core-image-full-cmdline
```

# Notes
Please note that:
1. `dunfell` branch of `meta-rockchip` use Linux version **5.4.205** by default. But for using `isotp` and `socketcand` you need at least Linux version **5.10.0** or later
2. You need to provide **5v0** supply for CAN transceiver (`tja1050`) because it won't work with **3v3** supply from _ASUS-Tinker_. (this [link](https://github.com/tolgakarakurt/CANBus-MCP2515-Raspi) is very good instruction about fixning this issue)
3. As you can see in [0001-add-can-interface.patch](recipes-core/init-ifupdown/init-ifupdown/0001-add-can-interface.patch), I'm using **125Kbps** bitrate

# More
1. This [presentation](https://wiki.automotivelinux.org/_media/agl-distro/agl2017-socketcan-print.pdf) explain SocketCAN in very good detail
2. You can use [SavvyCAN](https://www.savvycan.com/) with [socketcand](https://github.com/linux-can/socketcand). This way you have full access to `can0` interface of _ASUS-Tinker_ over ethernet and great GUI of SavvyCAN
