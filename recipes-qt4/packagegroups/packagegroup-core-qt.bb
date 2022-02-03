#
# Copyright (C) 2010  Intel Corporation. All rights reserved
#

SUMMARY = "Qt package groups"
LICENSE = "MIT"
PR = "r4"

# Qt4 could NOT be built on MIPS64 with 64 bits userspace
COMPATIBLE_HOST:mips64 = "null"

inherit packagegroup features_check

# The quicky and fotowall requires x11 in DISTRO_FEATURES
REQUIRED_DISTRO_FEATURES = "x11"

PACKAGES = "${PN}-demoapps"

QTDEMOS ?= "quicky qmmp fotowall"

SUMMARY:${PN}-demoapps = "Qt demo applications"
RDEPENDS:${PN}-demoapps = "${QTDEMOS}"
