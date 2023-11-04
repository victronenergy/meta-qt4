require qt4-x11-free.inc
require qt4-${PV}.inc

QT_CONFIG_FLAGS:append_arm = "${@bb.utils.contains("TUNE_FEATURES", "neon", "", " -no-neon" ,d)}"

QT_CONFIG_FLAGS += " \
 -no-embedded \
 -xrandr \
 -x11"
