DESCRIPTION = "The OpenAI Python library provides convenient access to the OpenAI API from applications written in the Python language."
HOMEPAGE = "https://github.com/openai/openai-python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=392ea6e86888f6031a506fa76b46ecfb"

SRC_URI = "git://github.com/openai/openai-python.git;protocol=https;branch=main"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit setuptools3

RDEPENDS_${PN} += " \
    python3-requests \
    python3-click \
    python3-pyjwt \
    python3-requests-toolbelt \
    "
