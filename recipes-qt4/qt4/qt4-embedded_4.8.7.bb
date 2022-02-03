require qt4-${PV}.inc
require qt4-embedded.inc

QT_CONFIG_FLAGS:append:arm = "${@bb.utils.contains("TUNE_FEATURES", "neon", "", " -no-neon" ,d)}"

QT_CONFIG_FLAGS += " \
 -exceptions \
"

