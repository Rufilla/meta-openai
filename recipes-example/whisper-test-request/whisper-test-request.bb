DESCRIPTION = "A simple python example call to the Whisper Speech To Text engine"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://test-whisper.py"
SRC_URI += "file://audio-example.mp3"

S = "${WORKDIR}"

inherit allarch

do_install() {
    install -d ${D}${bindir}
    install -m 0755 test-whisper.py ${D}${bindir}
    install -m 0755 audio-example.mp3 ${D}${bindir}
}

RDEPENDS_${PN} += " \
    python3-openai \
    "

FILES_${PN} += "${bindir}"