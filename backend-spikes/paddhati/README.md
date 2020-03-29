

# Paddhati #

Paddhati (f.) 1. a system
Paddha (adj.) 1. expert in 2. subject to, serving, attending

Paddhati is a prototype service for the Pariyatti mobile app. It will allow Editors and Librarians to
edit the library and it will provide an API for the mobile app to query.


# Development #


## OSX ##

1. Install Python inside `pyenv`:

```sh
brew update
brew install pyenv
pyenv install 3.7.3
pyenv global 3.7.3
echo -e 'if command -v pyenv 1>/dev/null 2>&1; then\n  eval "$(pyenv init -)"\nfi' >> ~/.zshrc
echo -e 'if command -v pyenv 1>/dev/null 2>&1; then\n  eval "$(pyenv init -)"\nfi' >> ~/.bash_profile
# bounce your shell
which python # should return: /Users/$USER/.pyenv/shims/python
```

2. Install Django:

```sh
python -m pip install Django
which django-admin # if there is no django-admin, you'll have to do something like this:
ln -s /Users/$USER/.pyenv/versions/3.7.3/lib/python3.7/site-packages/django/bin/django-admin.py /usr/local/bin/django-admin
cd ~/work/pariyatti/paddhati # or whatever
python manage.py runserver
```

3. Get Neo4j Desktop:

https://neo4j.com/download/