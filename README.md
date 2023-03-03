# Yocto OpenAI Meta Layer

Note: This is unofficial and not supported by OpenAI.

# Yocto meta-openai

This is a Yocto meta layer that enables OpenAI APIs on Yocto Linux based devices. 
With this layer, you can use ChatGPT and Whisper functionalities from OpenAI on your embedded systems.

## What are Yocto meta layers?

Yocto meta layers are repositories that contain related metadata (i.e. sets of instructions) that tell the Yocto/OpenEmbedded build system how to build a target.

## What are OpenAI APIs?

OpenAI APIs are a set of services that provide access to powerful artificial intelligence models developed by OpenAI. 
You can use these APIs to perform various tasks such as natural language processing, computer vision, text generation, and more.

## What is the ChatGPT API?

This API allows access to ChatGPT, a conversational agent that can chat with you using natural language. 
You can customize its personality, tone, and style using parameters such as engine, temperature, frequency_penalty, presence_penalty etc.

The API was officially released on 2nd March 2022 - so it's work in progress in this layer :-)

Please see the corresponding sections below for details.

# Dependencies

  URI: git://git.openembedded.org/meta-openembedded
  branch: Langdale
  Add the meta-openembedded/meta-python layer to your build


# Adding the meta-openai layer to your build

Run 'bitbake-layers add-layer meta-openai'

