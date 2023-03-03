SUMMARY = "OpenAI Test Image"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

inherit core-image

IMAGE_INSTALL:append = " python3"
IMAGE_INSTALL:append = " python3-pip"
IMAGE_INSTALL:append = " python3-aiohttp"
IMAGE_INSTALL:append = " python3-tqdm"
IMAGE_INSTALL:append = " python3-requests"
IMAGE_INSTALL:append = " python-openai"
IMAGE_INSTALL:append = " openai-test-request"
IMAGE_INSTALL:append = " chatgpt-test-request"
IMAGE_INSTALL:append = " whisper-test-request"

# Set the root password for the image
EXTRA_IMAGE_FEATURES = "debug-tweaks ssh-server-openssh"
#inherit extrausers
#EXTRA_USERS_PARAMS = "usermod -P password root;"

# Set the hostname for the image
HOSTNAME = "openai-test-image"

# Set the default console for the image
SERIAL_CONSOLE = "115200 ttyS0"

# Set the timezone for the image
TIMEZONE = "UTC"
