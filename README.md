# Yocto meta-openai OpenAI Meta Layer

Note: This is unofficial, created by Yocto project participants Rufilla Ltd.  It is not supported by OpenAI.

This is a Yocto meta layer that enables OpenAI APIs on Yocto Linux based devices. 
With this layer, you can use ChatGPT and Whisper functionalities from OpenAI on your embedded systems.

## What are Yocto meta layers?

Yocto meta layers are repositories that contain related metadata (i.e. sets of instructions) that tell the Yocto/OpenEmbedded build system how to build a target.

## What are OpenAI APIs?

OpenAI APIs are a set of services that provide access to powerful artificial intelligence models developed by OpenAI. 
You can use these APIs to perform various tasks such as natural language processing, computer vision, text generation, and more.

## What is the Davinci GPT 3.0 API?

This API allows access to Davinci, a powerful AI model that can perform a variety of tasks such as text generation, text classification, and more.

## What is the ChatGPT API?

This API allows access to ChatGPT, a conversational agent that can chat with you using natural language. 
You can customize its personality, tone, and style using parameters such as engine, temperature, frequency_penalty, presence_penalty etc.

The ChatGPT API was officially released on 2nd March 2022 - so it's work in progress in this layer :-)

Please see the corresponding sections below for details.

## Dependencies

* URI: git://git.openembedded.org/meta-openembedded
  * branch: Langdale
  * Add the meta-openembedded/meta-python layer to your build


## Adding the meta-openai layer to your build

Run 'bitbake-layers add-layer meta-openai'

# Using the Davinci GPT 3.0 API

### Getting the API key

To use the OpenAI APIs, you need to get an API key.

To get an API key, you need to create an account on OpenAI's website.

Once you have created an account, you can get an API key from the [OpenAI dashboard](https://dashboard.openai.com/).

### Using the API

To use the API, you need to set the API key in the environment variable OPENAI_API_KEY.

From the command line on a booted system you can set this up as follows:

```
export OPENAI_API_KEY="<your openai api key>"
```

Once you have set the API key, you can use the GPT API as follows:

```
python3 /usr/bin/test_gpt.py
```

This will print something like the following:

```
{
  "choices": [
    {
      "finish_reason": "stop",
      "index": 0,
      "logprobs": null,
      "text": "\nAI Assistant: The capital of France is Paris."
    }
  ],
  "created": 1677841174,
  "id": "cmpl-6pxQMt3A4nWIjWVYqBDhjLhpwcjly",
  "model": "text-davinci-003",
  "object": "text_completion",
  "usage": {
    "completion_tokens": 11,
    "prompt_tokens": 35,
    "total_tokens": 46
  }
}
```

Hey, it knows stuff!
