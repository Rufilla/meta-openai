# Yocto meta-openai OpenAI Meta Layer

Note: This is unofficial, created by Yocto project participants [Rufilla Ltd](https://rufilla.com).  It is not supported by OpenAI.

This is a Yocto meta layer that enables OpenAI APIs on Yocto Linux based devices. 
With this layer, you can use ChatGPT and Whisper functionalities from OpenAI on your embedded systems.

## What are Yocto meta layers?

Yocto meta layers are repositories that contain related metadata (i.e. sets of instructions) that tell the Yocto/OpenEmbedded build system how to build a target.

## What are OpenAI APIs?

OpenAI APIs are a set of services that provide access to powerful artificial intelligence models developed by OpenAI. 
You can use these APIs to perform various tasks such as natural language processing, computer vision, text generation, and more.

### What models are available?

This API allows access to **ChatGPT**, a conversational agent that can chat with you using natural language. 
You can customize its personality, tone, and style using parameters such as engine, temperature, frequency_penalty, presence_penalty etc.

The ChatGPT API was officially released on 2nd March 2022 - so this layer is very new!

This API also allows access to **Davinci**, a powerful AI model that can perform a variety of tasks such as text generation, text classification, and more.

## Dependencies

* URI: git://git.openembedded.org/meta-openembedded
  * branch: Langdale
  * Add the meta-openembedded/meta-python layer to your build

## Adding the meta-openai layer to your build

```
bitbake-layers add-layer meta-openai
```

## Getting the OpenAI API key

To use the OpenAI APIs, you need to get an API key.

To get an API key, you need to create an account on OpenAI's website.

Once you have created an account, you can get an API key from the [OpenAI dashboard](https://dashboard.openai.com/).


# Using the ChatGPT API

The ChatGPT API allows access to ChatGPT, a conversational agent that can chat with you using natural language.

To use the API, you need to set the API key in the environment variable OPENAI_API_KEY.

From the command line on a booted system you can set this up as follows:

```
export OPENAI_API_KEY="<your openai api key>"
```

Once you have set the API key, you can use the ChatGPT API as follows:

```
python3 /usr/bin/test_chatgpt.py
```

This will print something like the following:

```
# python3 test-chatgpt.py 
{
  "choices": [
    {
      "finish_reason": "stop",
      "index": 0,
      "message": {
        "content": "Orange who?",
        "role": "assistant"
      }
    }
  ],
  "created": 1677845696,
  "id": "chatcmpl-6pybIsrUEg11UaAEErIDND8fKJXyU",
  "model": "gpt-3.5-turbo-0301",
  "object": "chat.completion",
  "usage": {
    "completion_tokens": 5,
    "prompt_tokens": 38,
    "total_tokens": 43
  }
}
```

Showing that one of the most important developments in computer science this millenia can be the recipient of a very poor knock knock joke :-)

More information on this new ChatGPT API can be found on the [OpenAI Cookbook](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_format_inputs_to_ChatGPT_models.ipynb).


# Using the Davinci GPT 3.0 API

The OpenAI API also allows access to Davinci, a powerful AI model that can perform a variety of tasks such as text generation, text classification, and more.

Prior to the release of the new ChatGPT API, this was the primary way to interact with OpenAI's AI models.

To use the API, you need to set the API key in the environment variable OPENAI_API_KEY.

From the command line on a booted system you can set this up as follows:

```
export OPENAI_API_KEY="<your openai api key>"
```

Once you have set the API key, you can use the GPT API as follows:

```
python3 /usr/bin/test-gpt.py
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


# Using the Whisper API

The new OpenAI Whisper API allows for speech to text transcription and translation of speech into a host of languages.  Truly exciting for device makers!

To use the API, you need to set the API key in the environment variable OPENAI_API_KEY.

From the command line on a booted system you can set this up as follows:

```
export OPENAI_API_KEY="<your openai api key>"
```

Once you have set the API key, you can use the Whisper API as follows:

```
python3 /usr/bin/test-whisper.py
```

This will print something like the following:

```
{
  "text": "Mary had a little lamb, his fleece was white as snow, and everywhere that Mary went, the lamb was sure to go."
}
```


# What's Next?

We intend to keep this layer up-to-date, add DALL-E2 and other useful interfaces, plus examples and step-by-step guides.

Let us know if you have any suggestions or feedback, or if you would like to contribute.  Please post any issues you have in the Issue tracker.

Cheers! 

The Rufilla team.
