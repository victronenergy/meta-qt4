QT4DEPENDS ?= "qt4-x11 "
DEPENDS:prepend = "${QT4DEPENDS}"

# depends on qt4-x11
REQUIRED_DISTRO_FEATURES += "x11"

inherit qmake2 features_check

QT_BASE_NAME = "qt4"
QT_DIR_NAME = "qt4"
QT_LIBINFIX = ""

# Qt4 uses atomic instructions not supported in thumb mode
ARM_INSTRUCTION_SET = "arm"
