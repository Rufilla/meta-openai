DESCRIPTION = "A simple python example call to the ChatGPT engine"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://test-chatgpt.py"

S = "${WORKDIR}"

inherit allarch

do_install() {
    install -d ${D}${bindir}
    install -m 0755 test-chatgpt.py ${D}${bindir}
}

RDEPENDS_${PN} += " \
    python3-openai \
    "

FILES_${PN} += "${bindir}"